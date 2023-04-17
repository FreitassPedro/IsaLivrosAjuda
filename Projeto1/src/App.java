import java.util.Scanner;
public class App {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Scanner entradaString = new Scanner(System.in);

        int menu;
        Livro objLivro;

        String titulo, autor, editora, paisAutor;
        Long isbn;
        int anoPub;

        do {
            exibirMenu();
            menu = entrada.nextInt();
            Autor objAutor;

            switch (menu) {
                case 1:
                    System.out.println("Digite o Título: ");
                    titulo = entradaString.nextLine();

                    System.out.println("Digite o ISBN: ");
                    isbn = entrada.nextLong();

                    System.out.println("Digite o Autor: ");
                    autor = entradaString.nextLine();

                    System.out.println("Digite país do autor: ");
                    entrada.nextLine();
                    paisAutor = entrada.nextLine();

                    System.out.println("Digite o Editora: ");
                    editora = entradaString.nextLine();

                    System.out.println("Digite o ano de Publicação: ");
                    anoPub = entrada.nextInt();

                    objAutor = new Autor(autor, paisAutor);
                    objLivro = new Livro(titulo, isbn, objAutor, editora, anoPub);
                    ListaDeLivros.adicionarLivros(objLivro);
                    break;

                case 2:
                    System.out.println("Lista dos Livros: ");
                    System.out.println(ListaDeLivros.listarLivros());
                    break;

                case 3:
                    System.out.println("Digite o Título do Livro: ");
                    titulo = entradaString.nextLine();

                    if (ListaDeLivros.getListaDeLivros().isEmpty()) {
                        System.out.println("Não existem livros no acervo!!");
                    } else if (ListaDeLivros.remove(titulo)) {
                        System.out.println("Livro removido com sucesso ");
                    } else {
                        System.out.println("Título não encontrado ");
                    }
                    break;
                case 4:
                    System.out.println("Pesquisar por Autor");
                    autor = entradaString.nextLine();
                    System.out.println("Livros do autor " + autor + ":");
                    for (Livro livro : ListaDeLivros.getListaDeLivros()) {
                        if (livro.getAutor().equalsIgnoreCase(autor)) {
                            System.out.println(livro.getTitulo());
                        }
                    }
                    break;


                case 5:
                    Scanner input = new Scanner(System.in);
                    System.out.print("Digite o ano inicial do intervalo: ");
                    int anoInicial = input.nextInt();
                    System.out.print("Digite o ano final do intervalo: ");
                    int anoFinal = input.nextInt();

                    System.out.println("Livros publicados entre " + anoInicial + " e " + anoFinal + ":");
                    for (Livro livro : ListaDeLivros.getListaDeLivros()) {
                        if (livro.getAnoPub() >= anoInicial && livro.getAnoPub() <= anoFinal) {
                            System.out.println(livro.getTitulo());
                        }
                    }


                    break;

                case 6:
                    System.out.println("Total de livros na biblioteca: " + ListaDeLivros.size());
                    break;


                case 7:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção Inválida!");

            }

        } while (menu != 7);

        entrada.close();
        entradaString.close();

    }

    static void exibirMenu() {
        System.out.println("=====Livros da Biblioteca =====");
        System.out.println(" 1 - Cadastrar Livros");
        System.out.println(" 2 - Listar os Livros");
        System.out.println(" 3 - Excluir os Livros");
        System.out.println(" 4 - Pesquisar por Autores");
        System.out.println(" 5 - Pesquisar por Ano de Publicação");
        System.out.println(" 6 - O Total de Livros na Biblioteca");
        System.out.println(" 7 - Sair");
    }


}