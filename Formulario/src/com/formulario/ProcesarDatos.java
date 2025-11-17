package com.formulario;

/**
 *
 * @author loren
 */
public class ProcesarDatos {
   //Atributos privados de la clase ProcesarDatos
   private String matricula;
   private String nombres;
   private String apellidos;
   private String cuatrimestreCursado;
   
   //Getters y Setters de cada atributo
   public String getMatricula (){
   return matricula;
   }
   public void SetMatricula(String matricula){
   this.matricula = matricula;
   }
   public String getNombres(){
   return nombres;
   }
   public void SetNombres(String nombre){
   this.nombres = nombre;
   }
   public String getApellidos(){
   return apellidos;
   }
   public void SetApellidos( String apellidos){
   this.apellidos = apellidos;
   }
   public String getCuatrimestre(){
   return cuatrimestreCursado;
   }
   public void SetCuatri(String cuatri){
   this.cuatrimestreCursado = cuatri;
   }
   
   //Métodos paar capturar y presentar los datos
   public void capturarDatos(String matricula,String nombres,String apellidos,String cuatrimestre){
  
   SetMatricula(matricula);
   SetNombres(nombres);
   SetApellidos(apellidos);
   SetCuatri(cuatrimestre);
   }
   public String presentarDatos(){

     String datos ="\tDatos del Participante:\n"
                + "\tMatrícula: " + getMatricula() + "\n"
                + "\tNombres: " + getNombres() + "\n"
                + "\tApellidos: " + getApellidos() + "\n"
                + "\tCuatrimestre: " + getCuatrimestre();
     return datos;  
   }
}
