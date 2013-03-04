package practice09.etc.visitor.changed;

interface Visitor
{
    public abstract void visit(Directory node);
    public abstract void visit(File node);
}
