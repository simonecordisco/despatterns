public class Cerchio implements Forma {

    private String nome;
    private int numeroLati;




    public Cerchio(String nome, int numeroLati) {
        this.nome = nome;
        this.numeroLati = numeroLati;
    }

        @Override
        public void draw () {
            System.out.println("Nome della forma è:  "+ nome + " e il numero dei  lati è :  "+ numeroLati);

        }

    }

