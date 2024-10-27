package pe.edu.cibertec.ws_soap_bd.service;

import pe.edu.cibertec.ws_soap_bd.model.db.Domicilio;

import java.util.List;

public interface IDomicilioService {
    List<Domicilio> obtenerDomicilios();
    Domicilio obtenerDomicilio(int id);
    Domicilio guardarDomicilio(Domicilio domicilio);
}
