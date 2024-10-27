package pe.edu.cibertec.ws_soap_bd.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.ws_soap_bd.model.db.Domicilio;
import pe.edu.cibertec.ws_soap_bd.repository.DomicilioRepository;

import java.util.List;

@RequiredArgsConstructor
@Service
public class DomicilioService implements IDomicilioService {

    private final DomicilioRepository domicilioRepository;

    @Override
    public List<Domicilio> obtenerDomicilios() {
        return domicilioRepository.findAll();
    }

    @Override
    public Domicilio obtenerDomicilio(int id) {
        return domicilioRepository.findById(id).orElse(null);
    }

    @Override
    public Domicilio guardarDomicilio(Domicilio domicilio) {
        return domicilioRepository.save(domicilio);
    }
}
