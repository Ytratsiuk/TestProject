package HW.src.callByRef;

public class Reference {
    int data=50;

    void change(Reference op){
        op.data=op.data+100;//changes will be in the local variable only
    }


    public static void main(String args[]){
        Reference op=new Reference();

        System.out.println("before change "+op.data);
        op.change(op);//passing object
        System.out.println("after change "+op.data);

    }
}

