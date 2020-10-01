public class Nodes<T> {
    private T obj;
    private Nodes p;
    private Nodes c;

    Nodes(){
    }
    public void Node(T obj, Nodes p, Nodes c){
        this.obj = obj;

    }
    public void Noder(T obj){
        this.obj = obj;
    }
    public T getObj(){
        return this.obj;
    }
    public Nodes getParent(){
        return this.p;
    }

    public Nodes getChild(){
        return this.c;
    }

    public void setObj(T obj){
        this.obj = obj;
    }
    public String toString(){
        String s = "Node-type: " + this.getObj().getClass().getName();
        return s;
    }
    public boolean nodeEquals(Nodes a, Nodes b){
        if(a.equals(b)){
            return true;
        }
        else {
            return false;
        }
    }
}

class Main{
    public static void main(String[] args) {
        int test_int = 13;
        Nodes <Integer> int_node = new Nodes<Integer>();
        int_node.setObj(test_int);
        System.out.println(int_node.getObj());
        System.out.println(int_node.toString());
        Nodes <Integer> pnode = new Nodes<Integer>();
        Nodes <Integer> cnode = new Nodes<Integer>();
        int_node.Node(int_node.getObj(), pnode, cnode);
    }
}
