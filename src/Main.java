import LCSE.Lista;

public class Main {
    public static void main(String[] args){
        Lista lista = new Lista();

        Lista.insertar(5);
        Lista.insertar(4);
        Lista.insertar(3);
        Lista.insertar(2);
        Lista.insertar(1);
        Lista.insertar(0);

        Lista.mostrar(5);
    }
}
