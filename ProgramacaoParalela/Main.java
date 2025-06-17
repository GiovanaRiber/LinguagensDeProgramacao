package ProgramacaoParalela;

import java.util.concurrent.Callable;

class Robo implements Callable<Long> {
    private long x, y;
   
    public Robo(long x, long y){
        this.x = x;
        this.y = y;
    }

    @Override
    public Long call() { 
        return contar(x, y); 
    }
    
    public long contar(long x, long y) {
        if (x == 0 || y == 0)
            return 1;
        
        return contar(x - 1, y) + contar(x, y - 1);
    }
}

class Main {
    public static void main(String[] args) {

        Robo r1 = new Robo(2, 1);
        Robo r2 = new Robo(1, 2);
        System.out.println("Possibilidades: " + (r1.call() + r2.call()));
        //System.out.println(r2.call());
    }
}