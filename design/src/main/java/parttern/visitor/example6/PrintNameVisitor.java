package parttern.visitor.example6;
/**
 * 具体的访问者，实现：输出对象的名称，在组合对象的名称前面添加"节点："，
 * 在叶子对象的名称前面添加"叶子："
*/
public class PrintNameVisitor implements Visitor {
	public void visitComposite(Composite composite) {
		//访问到组合对象的数据
		
		composite.setName("节点："+composite.getName());
		
		//如果还包含有子组件，那么就输出这些子组件对象
		if(composite.getChildComponents()!=null){
			//输出当前对象的子对象了
			for(Component c : composite.getChildComponents()){
				//递归输出每个子对象
				c.accept(this);
			}
		}	
		
//		System.out.println("节点："+composite.getName());
	}
	public void visitLeaf(Leaf leaf) {
		leaf.setName("叶子："+leaf.getName());
		//访问到叶子对象的数据		
//		System.out.println("叶子："+leaf.getName());
	}
}
