package InitializerBlock;

class Base {
    protected int a;
    protected int b;
    void print() { System.out.println("a: " + a); }
}

class AnonymousClassMaker {
    Base createAnonymous() {
        return new Base() {     // (1) Anonymous class
            {                    // (2) Instance initializer
                a = 5; b = 10;
            }

            @Override
            void print() {
                super.print();
                System.out.println("b: " + b);
            }
        }; // end anonymous class
    }
}

public class InitializerBlock {

    {
        System.out.println("Static inicializer 1");
    }

    public InitializerBlock(){
        System.out.println("object intancied");
    }

    public static void main(String[] args){
        InitializerBlock intBlock = new InitializerBlock();
        InstanceInitializersII instance = new InstanceInitializersII();

        //System.out.println("i na main: "+ instance.i);

        System.out.println("nsf1: " + intBlock.nsf1);
        System.out.println("nsf2: " + intBlock.nsf2);

        new AnonymousClassMaker().createAnonymous().print();

    }

    static {
        System.out.println("Static inicializar 2 - after the main method");
    }

    {                                    // (1) Instance initializer block.
        int nsf1 = 10;                        // (2) OK. Assignment to nsf1 allowed.
        nsf1 = sf1;                       // (3) OK. Static field access in nonstatic context.
        // int a = 2 * nsf1;              // (4) Not OK. Read operation before declaration.
        var b = nsf1 = 20;                // (5) OK. Assignment to nsf1 allowed.
        int c = this.nsf1;                // (6) OK. Not accessed by simple name.
    }

    int nsf1 = nsf2 = 30;                // (7) Nonstatic field. Assignment to nsf2 allowed.
    int nsf2;                            // (8) Nonstatic field.
    static int sf1 = 5;                  // (9) Static field.

    {                                    // (10) Instance initializer block.
        int d = 2 * nsf1;                // (11) OK. Read operation after declaration.
        var e = nsf1 = 50;                // (12) OK. Assignment to nsf1 allowed.
    }

    public static class InstanceInitializersII {

        { //Instance initializer with forward references. (1)
            i = j = 10;                                 // (2) Permitted.
            int result = this.i * this.j;               // (3) i is 10, j is 10.

            System.out.println("i na classe static " + this.i);                 // (4) 10
            System.out.println("j na classe static " + this.j);                 // (5) 10
            System.out.println("k na classe static " + this.k);                 // (6) 50
        }

        // Instance field declarations.
        int i;             // (7) Field declaration without initializer expression
        int j = 100;       // (8) Field declaration with initializer expression.
        final int k = 50;  // (9) Final instance field with constant expression.
    }
}
