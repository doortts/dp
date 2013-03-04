package practice09.etc.visitor.before;

class RenameVisitor implements Visitor
{
    public void visit(Directory node)
    {
    	System.out.println("rename directory: " + node.getName());
    }
    
    public void visit(File node)
    {
    	System.out.println("rename file: " + node.getName());
    }
}