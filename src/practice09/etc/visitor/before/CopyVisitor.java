package practice09.etc.visitor.before;

class CopyVisitor implements Visitor
{
    public void visit(Directory node)
    {
    	System.out.println("copy: " + node.getName());
    }
    
    public void visit(File node)
    {
    	System.out.println("copy: " + node.getName());
    }
}