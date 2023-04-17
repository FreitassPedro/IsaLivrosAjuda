import java.lang.reflect.Array;
import java.util.*;

public class ListaDeLivros {
    private static ArrayList<Livro> listLivros = new ArrayList<>();

    // Adicionar livros à lista 
    public static void adicionarLivros(Livro l) {
        listLivros.add(l);
        ordem();
    }

    // Ordenar em ordem Alfabetica os livros FREiTAS AJUDE
    public static void ordem(){
        Comparator<Livro> comparator = new Comparator<>() {

            public int compare(Livro o1, Livro o2) {
                return o1.getTitulo().compareTo(o2.getTitulo());
            }
        };
        listLivros.sort(comparator);
    }

    // Listar os dados dos livros 
    public static String listarLivros() {
        String saída = "";
        int i = 1;
        for (Livro l : listLivros) {
            saída += "\n========= Livro Nº " + (i++) + " ====\n";
            saída += l.imprimir() + "\n";
        }
        return saída;
    }

    // Pesquisar quantidade de livros de um autor 
    public int pesquisar(Autor autor) {
        int qtd = 0;
        for (Livro l : listLivros) {
            if (l.getAutor().equalsIgnoreCase(autor)) {
                qtd++;
            }
        }
        return qtd;
    }

    // Remover livro da lista 
    public static boolean remove(String titulo) {
        for (Livro l : listLivros) {
            if (l.getTitulo().equalsIgnoreCase(titulo)) {
                listLivros.remove(l);
                return true;
            }
        }
        return false;
    }

    // Pesquisar quantidade de livros publicados entre dois anos
    public int pesquisar(double anoInicial, double anoFinal) {
        int qtd = 0;
        for (Livro l : listLivros) {
            if (l.getAnoPub() >= anoInicial && l.getAnoPub() <= anoFinal) {
                qtd++;
            }
        }
        return qtd;
    }

    // Obter tamanho da lista de livros
    public static int size() {
        return listLivros.size();
    }

    // Obter um livro da lista pelo índice
    public static Livro get(int i) {
        return listLivros.get(i);
    }

    public static ArrayList<Livro> getListaDeLivros() {
        return listLivros;
    }
}
