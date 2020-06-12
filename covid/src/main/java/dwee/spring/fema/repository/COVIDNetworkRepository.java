package dwee.spring.fema.repository;

import dwee.spring.fema.entity.COVIDNetwork;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by dean on 5/31/20.
 *
 * Setting this interface in the Application class will initiate this interface
 */
public interface COVIDNetworkRepository extends CrudRepository<COVIDNetwork, Long> {

//    List<COVIDNetwork> findByCovidNetwork (String covidNetwork);

    List<COVIDNetwork> findByNetwork(String networks);

    List<COVIDNetwork> findByCatchment(String catchment);

    List<COVIDNetwork> findByYear(Integer year);

}
