package domain.repository;

import domain.dto.MesureDay;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface MeasureDayRepository {
    List<MesureDay> getAll();
    List<MesureDay>getByDeviceId(int deviceId);


    Optional<MesureDay> getById(int mesureDayId);
    MesureDay save(MesureDay mesureDay);
    void delete ( int mesureDayId);

    List<MesureDay>getByMedureDate(LocalDateTime date);
    List<MesureDay>getByMesureDateBetween(LocalDateTime startDate,LocalDateTime endDate);
    List<MesureDay>getByMesureDateAfter(LocalDateTime date);
    List<MesureDay>getByMesureDateBefore(LocalDateTime date);
    List<MesureDay> getByDeviceIdAndMesureDateBetween
            (int deviceID, LocalDateTime startDate, LocalDateTime endDate);



}
