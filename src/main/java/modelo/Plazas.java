/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Sandra Arguello M
 */
public class Plazas {
    private int id,idplaza;
    private String placa ,horaentrada,horasalida,nombreadmi;
    
public Plazas(int id ,  String placa , int idplaza , String horaentrada,String horasalida , String nombreadmi)
{
    this.id =id;
    this.idplaza=idplaza;
    this.placa=placa;
    this.horaentrada=horaentrada;
    this.horasalida=horasalida;
    this.nombreadmi=nombreadmi;
}
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdplaza() {
        return idplaza;
    }

    public void setIdplaza(int idplaza) {
        this.idplaza = idplaza;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getHoraentrada() {
        return horaentrada;
    }

    public void setHoraentrada(String horaentrada) {
        this.horaentrada = horaentrada;
    }

    public String getHorasalida() {
        return horasalida;
    }

    public void setHorasalida(String horasalida) {
        this.horasalida = horasalida;
    }

    public String getNombreadmi() {
        return nombreadmi;
    }

    public void setNombreadmi(String nombreadmi) {
        this.nombreadmi = nombreadmi;
    }
    
}
