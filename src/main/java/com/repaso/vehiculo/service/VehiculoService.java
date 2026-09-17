package com.repaso.vehiculo.service;

import com.repaso.vehiculo.dto.VehiculoDTO;
import com.repaso.vehiculo.entity.Vehiculo;
import com.repaso.vehiculo.repository.VehiculoRepository;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehiculoService {

    @Autowired
    private VehiculoRepository vehiculoRepository;

    public List<VehiculoDTO> findAll() {
        return vehiculoRepository.findAll()
                .stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    public List<VehiculoDTO> mostrarActivos() {
        return vehiculoRepository.findByEstado54TrueOrderByIdVehiculo54Desc()
                .stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    public VehiculoDTO crearVehiculo(VehiculoDTO dto54) {
        Vehiculo vehiculo54 = convertToEntity(dto54);
        vehiculo54.setEstado54(true);

        Vehiculo guardado54 = vehiculoRepository.save(vehiculo54);

        return convertToDTO(guardado54);
    }

    public VehiculoDTO modificarVehiculo(Integer idVehiculo54, VehiculoDTO dto54) {
        Vehiculo vehiculo54 = vehiculoRepository.findById(idVehiculo54)
                .orElseThrow(() ->
                        new RuntimeException("El vehiculo no existe con id " + idVehiculo54));

        vehiculo54.setPlaca54(dto54.getPlaca54());
        vehiculo54.setMarca54(dto54.getMarca54());
        vehiculo54.setModelo54(dto54.getModelo54());
        vehiculo54.setColor54(dto54.getColor54());
        vehiculo54.setPrecioDia54(dto54.getPrecioDia54());

        Vehiculo actualizado54 = vehiculoRepository.save(vehiculo54);

        return convertToDTO(actualizado54);
    }

    public VehiculoDTO anularVehiculo(Integer idVehiculo54) {
        Vehiculo vehiculo54 = vehiculoRepository.findById(idVehiculo54)
                .orElseThrow(() ->
                        new RuntimeException("El vehiculo no existe con id " + idVehiculo54));

        vehiculo54.setEstado54(false);

        Vehiculo anulado54 = vehiculoRepository.save(vehiculo54);

        return convertToDTO(anulado54);
    }

    private VehiculoDTO convertToDTO(Vehiculo vehiculo54) {
        VehiculoDTO dto54 = new VehiculoDTO();

        dto54.setIdVehiculo54(vehiculo54.getIdVehiculo54());
        dto54.setEstado54(vehiculo54.getEstado54());
        dto54.setPlaca54(vehiculo54.getPlaca54());
        dto54.setMarca54(vehiculo54.getMarca54());
        dto54.setModelo54(vehiculo54.getModelo54());
        dto54.setColor54(vehiculo54.getColor54());
        dto54.setPrecioDia54(vehiculo54.getPrecioDia54());

        return dto54;
    }

    private Vehiculo convertToEntity(VehiculoDTO dto54) {
        Vehiculo vehiculo54 = new Vehiculo();

        vehiculo54.setPlaca54(dto54.getPlaca54());
        vehiculo54.setMarca54(dto54.getMarca54());
        vehiculo54.setModelo54(dto54.getModelo54());
        vehiculo54.setColor54(dto54.getColor54());
        vehiculo54.setPrecioDia54(dto54.getPrecioDia54());
        vehiculo54.setEstado54(true);

        return vehiculo54;
    }
}