public class Main_S03L12 {
    public static void main(String[] args) { 
        Video_S03L12 v[] = new Video_S03L12[3];
        v[0] = new Video_S03L12("Aula 1 de POO");
        v[1] = new Video_S03L12("Aula 12 de PHP");
        v[2] = new Video_S03L12("Aula 10 de HTML5");

        Gafanhoto_S03L12 g[] = new Gafanhoto_S03L12[2];
        g[0] = new Gafanhoto_S03L12 ("Jubileu", 22, "M", "Juju");
        g[1] = new Gafanhoto_S03L12 ("Maria", 60, "F", "Maria123");

        System.out.println(g[0].toString());

        System.out.println(v[0].toString());

        Visualizacao_S03L12 vis = new Visualizacao_S03L12(g[0], v[2]);


        System.out.println(vis.toString());
    }
}
