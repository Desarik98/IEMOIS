package Dominio;
//No olvide documentar
public class Mooc{
    private String nombre;
    private String area;   
    private String objetivo;
    private String distribuidor;
    private int semanas;  

 
    public Mooc(String nombre, String area,  String objetivo, String  distribuidor, int semanas) throws IEMOISExcepcion,NumberFormatException {
        if(nombre.equals("")) {
            throw new IEMOISExcepcion(IEMOISExcepcion.SIN_NOMBRE);
        }
        else {
            this.nombre = nombre.trim();
            this.area = area.trim();
            this.objetivo = objetivo.trim();
            this.distribuidor = distribuidor.trim();
            this.semanas = semanas;
        }
    }
    
    /**
     * @return nombre del curso
     */
    public String getNombre(){
        return nombre;
    }

    /**
     * @return area del curso
     */
    public String getArea(){
        return area;
    }

    /**
     * @return objetivo del curso
     */
    public String getObjetivo(){
        return objetivo;
    }
    
    /**
     * @return compañia que da el curso
     */
    public String getDistribuidor(){
        return distribuidor;
    }    
    
    /**
     * @return numero de semanas que dura el curso
     */
    public int getSemanas(){
        return semanas;
    }
    


    /**
     * @return informacion del curso
     */
    public String toString(){
        return nombre + "\n" + area + "\n"+ distribuidor + "\nSemanas:" + semanas+"\n" +objetivo ;
    }

}
