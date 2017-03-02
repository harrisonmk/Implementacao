
import java.util.Arrays;


public class Itinerarios {
    
   private int id;
   private int id_caminhao;
   private int[] id_carga;
   private int[] id_cidade;

    public Itinerarios(int id, int id_caminhao, int[] id_carga, int[] id_cidade) {
        this.id = id;
        this.id_caminhao = id_caminhao;
        this.id_carga = id_carga;
        this.id_cidade = id_cidade;
    }
   
   
   public Itinerarios (){
       
       
       
   }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_caminhao() {
        return id_caminhao;
    }

    public void setId_caminhao(int id_caminhao) {
        this.id_caminhao = id_caminhao;
    }

    public int[] getId_carga() {
        return id_carga;
    }

    public void setId_carga(int[] id_carga) {
        this.id_carga = id_carga;
    }

    public int[] getId_cidade() {
        return id_cidade;
    }

    public void setId_cidade(int[] id_cidade) {
        this.id_cidade = id_cidade;
    }
   
   
    @Override
	public String toString() {
		return "\n ID: " +this.id+
                       "\n Caminhão: "+this.id_caminhao+
                       "\n Carga: "+Arrays.toString(this.id_carga)+
                       "\n Cidade: "+Arrays.toString(this.id_cidade);
                                              
                        
	}
    
}
