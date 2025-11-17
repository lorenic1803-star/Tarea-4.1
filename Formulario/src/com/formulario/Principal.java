package com.formulario;

/**
 *
 * @author loren
 */
public class Principal {
    public static void main(String[] args) {
        //Instancia de la clase Procesar Datos
        ProcesarDatos datosEstudiantes = new ProcesarDatos();
        //Prueba de funcionamiento de los métodos capturarDatos y presentar Datos
        datosEstudiantes.capturarDatos("2025-0064","Loreni Camila","Troncoso Gutierrez","2025-C3");
        System.out.println(datosEstudiantes.presentarDatos());
    }
  
}
