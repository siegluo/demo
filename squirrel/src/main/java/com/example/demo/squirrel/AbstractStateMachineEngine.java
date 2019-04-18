package com.example.demo.squirrel;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.GenericTypeResolver;
import org.springframework.stereotype.Component;
import org.squirrelframework.foundation.fsm.*;

public abstract class AbstractStateMachineEngine<T extends UntypedStateMachine> implements ApplicationContextAware {
    protected UntypedStateMachineBuilder stateMachineBuilder;
    private ApplicationContext applicationContext;

    @SuppressWarnings("unchecked")
    public AbstractStateMachineEngine() {
        //识别泛型参数
        Class<T> genericType = (Class<T>) GenericTypeResolver.resolveTypeArgument(getClass(),
                AbstractStateMachineEngine.class);
        stateMachineBuilder = null;
        stateMachineBuilder = StateMachineBuilderFactory.create(genericType, ApplicationContext.class);
    }
    //注入applicationContext，并在创建StateMachine实例时注入
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
    //delegate fire
    public void fire(int rmaId, Status initialState, Trigger trigger, Context context) {
        T stateMachine = stateMachineBuilder.newUntypedStateMachine(
                initialState,
                //暂时开启debug进行日志trace
                StateMachineConfiguration.create().enableDebugMode(true).enableAutoStart(true),
                //注入applicationContext
                applicationContext);
        stateMachine.fire(trigger, context);
    }
}
@Component
class DiscountRefundStateMachineEngine extends AbstractStateMachineEngine<DiscountRefundStateMachine> {
}