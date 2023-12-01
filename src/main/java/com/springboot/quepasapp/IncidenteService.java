package com.springboot.quepasapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IncidenteService {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public IncidenteService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Incidente> fetchData() {
        String sql = "select i.descripcion as incidente_nombre, pe.nombre as prestacion_nombre, e.nombre as entidad_nombre\n" +
                "from incidente i\n" +
                "join prestacion_de_servicio pe on i.servicioAfectado_id = pe.id\n" +
                "join establecimiento e on pe.establecimiento_id = e.id";
        return jdbcTemplate.query(sql, (rs, rowNum) -> {
            Incidente incidente = new Incidente();
            incidente.setDescripcion(rs.getString("incidente_nombre"));
            incidente.setPrestacionDeServicioNombre(rs.getString("prestacion_nombre"));
            incidente.setEntidadNombre(rs.getString("entidad_nombre"));
            return incidente;
        });
    }
}