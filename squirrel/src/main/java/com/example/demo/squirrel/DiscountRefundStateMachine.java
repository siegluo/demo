package com.example.demo.squirrel;

import org.springframework.context.ApplicationContext;
import org.squirrelframework.foundation.fsm.StateMachineContext;
import org.squirrelframework.foundation.fsm.annotation.*;
import org.squirrelframework.foundation.fsm.impl.AbstractUntypedStateMachine;

@StateMachineParameters(stateType = Status.class, eventType = Trigger.class,
        //StateMachineContext 自定义上下文，用来传递数据
        contextType = Context.class)
@States({
        @State(name = "PENDING", initialState = true),
        @State(name = "CONFIRMING"),
        @State(name = "REJECTED"),
        @State(name = "REFUND_APPROVING"),
        @State(name = "REFUND_APPROVED"),
        @State(name = "REFUND_FINISHED")
})
@Transitions({
        @Transit(from = "PENDING", to = "CONFIRMING", on = "APPLY_CONFIRM",
                callMethod = "doSomething"),
        @Transit(from = "CONFIRMING", to = "REJECTED", on = "REJECT"),
        @Transit(from = "CONFIRMING", to = "REFUND_APPROVING", on = "APPLY_APPROVED"),
        @Transit(from = "REFUND_APPROVING", to = "REFUND_APPROVED", on = "REFUND_APPROVED"),
        @Transit(from = "REFUND_APPROVED", to = "REFUND_FINISHED", on = "REFUND_FINISH_CONFIRM")
})
public class DiscountRefundStateMachine extends AbstractUntypedStateMachine {
    protected ApplicationContext applicationContext;

    //定义构造函数接受ApplicationContext注入([参看New State Machine Instance](http://hekailiang.github.io/squirrel/))
    public DiscountRefundStateMachine(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    public void doSomething(Status fromState, Status toState, Trigger event,
                            Context stateMachineContext) {
        System.out.println("哈哈");
    }

    @Override
    protected void afterTransitionCompleted(Object fromState, Object toState, Object event, Object context) {
        if (context instanceof Context && toState instanceof Status) {
            Context stateMachineContext = (Context) context;
            System.out.println(stateMachineContext.getId() +"                            "+ toState.toString());
            //从上下文中获取需要持久化的数据，例如订单ID等
//            Rma rma = stateMachineContext.get(MessageKeyEnum.RMA);
//            //持久化
//            rma.setStatus((State)toState);
//            this.applicationContext.getBean("rmaRepository").updateRma(rma);
        } else {
            throw new RuntimeException("type not support, context expect " + StateMachineContext.class.getSimpleName() + ", actually "
                    + context.getClass().getSimpleName() + ", state expect " + Status.class.getSimpleName()
                    + ", actually "
                    + toState.getClass().getSimpleName());
        }
    }
}