/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Demos_U1_introduccionPOO;

/**
 *
 * @author ERICK CLAIR
 */
public class Persona {
  
    /*Atributos de variables de clase*/
    
  private String nombre;
  private String apellidos;
  private String sexo;
  private String RFC;
  private int fechaNacimiento;
  
  public void seNombre(String nombre){
      this.nombre = nombre;
  } 
  public void setApellidos(String apellidoPaterno, String apellidoMaterno){
      apellidos = apellidoPaterno + "  " + apellidoMaterno;
  }
  public void setSexo(String sexo){
      this.sexo = sexo;
  }
  public void setRFC(String rfc){
      this.RFC = rfc;
  }
  public void setFechaNacimiento(int anio){
      this.fechaNacimiento = anio;
  }
  public String getNombre(){
      return this.nombre;
  }
  public String getApellidos(){
      return apellidos;
  }
  public String getSexo(){
      return sexo;
  }
  public String getRfc(){
      return RFC;
  }
  public int getEdad(){
      int fechaActual = 2014;
      return calcularEdad( fechaNacimiento, fechaActual);
  }
  private int calcularEdad(int fechaNacimiento, int fechaActual){
      int edad = fechaActual - fechaNacimiento;
      return edad;
  } 
}
