/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sinherencia;

import javax.swing.*;
import java.util.ArrayList;

import javax.swing.JOptionPane;


class Trabajador {
    private String nombreTrabajador;
    private int edadTrabajador;
    private double sueldo;
    private String cargo;

    public Trabajador() {
        this.nombreTrabajador = JOptionPane.showInputDialog("Ingrese el nombre del trabajador:");
        this.edadTrabajador = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del trabajador:"));
        this.sueldo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el sueldo del trabajador:"));
        this.cargo = JOptionPane.showInputDialog("Ingrese el cargo del trabajador:");
    }

    public String getNombreTrabajador() {
        return nombreTrabajador;
    }

    public void setNombreTrabajador(String nombreTrabajador) {
        this.nombreTrabajador = nombreTrabajador;
    }

    public int getEdadTrabajador() {
        return edadTrabajador;
    }

    public void setEdadTrabajador(int edadTrabajador) {
        this.edadTrabajador = edadTrabajador;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void asignarTarea(ProyectoTarea proyectoTarea) {
        JOptionPane.showMessageDialog(null, "Trabajador " + nombreTrabajador + " asignado a la tarea " + proyectoTarea.getNombreTarea());
    }
}

class Area {
    private String nombreArea;
    private String ubicacionArea;
    private ArrayList<Trabajador> listaTrabajadores;

    public Area() {
        this.nombreArea = JOptionPane.showInputDialog("Ingrese el nombre del área:");
        this.ubicacionArea = JOptionPane.showInputDialog("Ingrese la ubicación del área:");
        this.listaTrabajadores = new ArrayList<>();
    }

    public String getNombreArea() {
        return nombreArea;
    }

    public void setNombreArea(String nombreArea) {
        this.nombreArea = nombreArea;
    }

    public String getUbicacionArea() {
        return ubicacionArea;
    }

    public void setUbicacionArea(String ubicacionArea) {
        this.ubicacionArea = ubicacionArea;
    }

    public void agregarTrabajador(Trabajador trabajador) {
        listaTrabajadores.add(trabajador);
        JOptionPane.showMessageDialog(null, "Trabajador " + trabajador.getNombreTrabajador() + " agregado al área " + nombreArea);
    }

    public void mostrarTrabajadores() {
        StringBuilder listadoTrabajadores = new StringBuilder("Trabajadores en el área " + nombreArea + ":\n");
        for (Trabajador trabajador : listaTrabajadores) {
            listadoTrabajadores.append(trabajador.getNombreTrabajador()).append("\n");
        }
        JOptionPane.showMessageDialog(null, listadoTrabajadores.toString());
    }
}

class ProyectoTarea {
    private String nombreTarea;
    private double presupuestoTarea;
    private String fechaInicioTarea;
    private String fechaFinTarea;
    private ArrayList<Trabajador> trabajadoresAsignados;

    public ProyectoTarea() {
        this.nombreTarea = JOptionPane.showInputDialog("Ingrese el nombre de la tarea:");
        this.presupuestoTarea = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el presupuesto de la tarea:"));
        this.fechaInicioTarea = JOptionPane.showInputDialog("Ingrese la fecha de inicio de la tarea:");
        this.fechaFinTarea = JOptionPane.showInputDialog("Ingrese la fecha de fin de la tarea:");
        this.trabajadoresAsignados = new ArrayList<>();
    }

    public String getNombreTarea() {
        return nombreTarea;
    }

    public void setNombreTarea(String nombreTarea) {
        this.nombreTarea = nombreTarea;
    }

    public double getPresupuestoTarea() {
        return presupuestoTarea;
    }

    public void setPresupuestoTarea(double presupuestoTarea) {
        this.presupuestoTarea = presupuestoTarea;
    }

    public String getFechaInicioTarea() {
        return fechaInicioTarea;
    }

    public void setFechaInicioTarea(String fechaInicioTarea) {
        this.fechaInicioTarea = fechaInicioTarea;
    }

    public String getFechaFinTarea() {
        return fechaFinTarea;
    }

    public void setFechaFinTarea(String fechaFinTarea) {
        this.fechaFinTarea = fechaFinTarea;
    }

    public void asignarTrabajador(Trabajador trabajador) {
        trabajadoresAsignados.add(trabajador);
        JOptionPane.showMessageDialog(null, "Trabajador " + trabajador.getNombreTrabajador() + " asignado a la tarea " + nombreTarea);
    }

    public void mostrarTrabajadoresAsignados() {
        StringBuilder listadoTrabajadores = new StringBuilder("Trabajadores asignados a la tarea " + nombreTarea + ":\n");
        for (Trabajador trabajador : trabajadoresAsignados) {
            listadoTrabajadores.append(trabajador.getNombreTrabajador()).append("\n");
        }
        JOptionPane.showMessageDialog(null, listadoTrabajadores.toString());
    }
}

public class Proyecto {


        public static void main(String[] args) {
        // Crear empleados
        Trabajador empleado1 = new Trabajador();
        Trabajador empleado2 = new Trabajador();

        // Crear departamento y asignar empleados
        Area departamento = new Area();
        departamento.agregarTrabajador(empleado1);
        departamento.agregarTrabajador(empleado2);
        departamento.mostrarTrabajadores();

        // Crear proyecto y asignar empleados
        Proyecto proyecto = new Proyecto();
        proyecto.asignarTrabajador(empleado1);
        proyecto.asignarTrabajador(empleado2);
        proyecto.mostrarEmpleadosAsignados();
    }

    private void asignarTrabajador(Trabajador empleado1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void mostrarEmpleadosAsignados() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    
    
}
