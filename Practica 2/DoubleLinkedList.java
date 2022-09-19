/**
 * Implementacion de una lista doblemente ligada.
 * @author Jimena Ugalde Flores 
 * @author Paul Cesar Cabañas Segura
 * @since Estructuras de Datos 2023-1
 */

public class DoubleLinkedList<T> implements TDAList<T> {


    /**
     * Representacion de un Nodo
     */
    private class Nodo {

      /** Elemento almacenado en el nodo */
      public T element;
      
      /** Referencia a un nodo siguiente */
      public Nodo next;

      /** Referencia a un nodo anterior */
      public Nodo prev;
      
      /**
       * Crea un nuevo Nodo 
       * @param e el elemento a almacenar en el Nodo
       */  

      public Nodo(T e){
        this.element = e;
      }
       
    
    }

    /** Nodo cabeza */
    public Nodo head;

    /** Nodo cola */
    public Nodo tail;


    @Override
    public void add(int i, T e) throws IndexOutOfBoundsException {
      // Pasan algun indice invalido
      if(i < 0 || i >= size()){
        throw new IndexOutOfBoundsException();
      }
      
      // Crear un nuevo nodo
      Nodo newNode = new Nodo(e);

      // Cuando la lista es vacía
      if(head == null ){
        head = newNode;
        tail = newNode;
        return;
      }
      
      // Cuando se agrega en la primera posicion
      if(i == 0){
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        return;
      }

      // Agregar en la ultima posicion
      if(i == size()){
        newNode.prev = tail;
        tail.next = newNode;
        tail = newNode;
        return;
      }

      Nodo headIterator = head;

      for(int counter = 0; counter < i; counter++){
        
      }

    }

    @Override  
    public void clear(){

    }

    @Override
    public T get(int i){
      return null;
    }

    @Override
    public boolean contains(T e){
      return false;
    }

    @Override
    public boolean isEmpty(){
      return false;
    }

    @Override
    public int size(){
      return 0;  
    }


}
