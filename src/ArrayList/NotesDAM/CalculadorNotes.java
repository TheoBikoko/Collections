package ArrayList.NotesDAM;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class CalculadorNotes {
    ArrayList<Double> notes = new ArrayList<Double>();

    public CalculadorNotes() {
        this.notes = notes;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    CalculadorNotes dam1 = new CalculadorNotes();

    dam1.introdueixValors(input);
    dam1.sumaValors();
    dam1.sumaValorsIterator();
    }

    public void introdueixValors(Scanner input){
        double numberInput = input.nextDouble();
        while(numberInput != -1){
            if (numberInput >= 0){
                notes.add(numberInput);
            }
            else System.out.println("El valor de la nota no pot ser negatiu. Si us plau, torna a provar.");
            numberInput = input.nextDouble();
        }
    }

    public void sumaValors(){
        int comptador = 0;
        double total = 0;
        for (Double nota:notes){
            total += nota;
            comptador++;
        }
        System.out.println( "La mitjana en programació de la classe DAM1 és un " + total/comptador + ".");
    }

    public void sumaValorsIterator(){
        Iterator<Double> sumaNotes = notes.iterator();
        int comptador = 0;
        double total = 0;
        while(sumaNotes.hasNext()){
            total += sumaNotes.next();
            comptador++;
        }
        System.out.println( "La mitjana en programació de la classe DAM1 és un " + total/comptador + ".");
        }

    }
