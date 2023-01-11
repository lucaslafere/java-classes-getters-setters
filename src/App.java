
public class App {
    public static void main(String[] args) {
        User novoUsuario = new User();
        novoUsuario.setName("Lucas");
        novoUsuario.setCollege("Driven");
        novoUsuario.setEmail("blablabla@gmail.com");
        novoUsuario.subjects.setName("Java");
        System.out.println(novoUsuario.getName());
        System.out.println(novoUsuario.getEmail());
        System.out.println(novoUsuario.getCollege());
        System.out.println(novoUsuario.subjects.getName());
    }
}
