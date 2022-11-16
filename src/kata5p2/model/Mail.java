package kata5p2.model;


public class Mail{
    
    private String email;    

    public Mail(String email) {
        this.email = email;
    }
    
    public String getEmail() {
        return email;
    }
    
    public String getDomain() {
        String[] correo = getEmail().split("[@]");
	String[] domain = correo[1].split("[.]",2);
        String dominio = domain[1];
        return dominio;
    }

}
