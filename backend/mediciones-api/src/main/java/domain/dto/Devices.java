package domain.dto;

import com.MARM.mediciones_api.persistence.Entity.MedidadDia;
import com.MARM.mediciones_api.persistence.Entity.MedidasAño;
import com.MARM.mediciones_api.persistence.Entity.MedidasMes;
import com.MARM.mediciones_api.persistence.Entity.MedidasSemana;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter

public class Devices {
    private Integer devicesId;
    private  String devicesName;
    private  String state;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private Integer idUbicacion; // ID de ubicación


    @Override
    public String toString() {
        return "Devices{" +
                "id=" + devicesId +
                ", nombre='" + devicesName + '\'' +
                ", idUbicacion=" + idUbicacion +
                ", estado='" + state + '\'' +
                ", createdAt=" + createdDate +
                ", updatedAt=" + updatedDate +
                '}';
    }

}
