package com.example.demo.repo;

import com.example.demo.domain.Worker;
import org.springframework.jdbc.config.JdbcNamespaceHandler;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class Repo {
    private JdbcTemplate jdbcTemplate;



    public Repo(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;

    }

    public List<Worker> getAll() {
        return jdbcTemplate.query(
                "SELECT ID,WORKERID, RENT, JANRENT, FEBRENT, MARRENT, APRRENT, MAYRENT, JUNERENT, JULYRENT, AUGRENT, SEPRENT, OCTRENT, NOVRENT, DECRENT from workers",
                (rs, i) -> new Worker(
                        rs.getInt("id"),
                        rs.getInt("workerId"),
                        rs.getDouble("rent"),
                        rs.getDouble("janRent"),
                        rs.getDouble("febRent"),
                        rs.getDouble("marRent"),
                        rs.getDouble("aprRent"),
                        rs.getDouble("mayRent"),
                        rs.getDouble("juneRent"),
                        rs.getDouble("julyRent"),
                        rs.getDouble("augRent"),
                        rs.getDouble("sepRent"),
                        rs.getDouble("octRent"),
                        rs.getDouble("novRent"),
                        rs.getDouble("decRent")

                ));
    }

    public List<Worker> findById(int id){
        return jdbcTemplate.query("select id,workerId,rent,janRent,febRent,marRent,aprRent,mayRent,juneRent,julyRent,augRent,sepRent,octRent,novRent,decRent from WORKERS where id=?",
                new Object[]{id},
                (rs,i)-> new Worker(
                        rs.getInt("id"),
                        rs.getInt("workerId"),
                        rs.getDouble("rent"),
                        rs.getDouble("janRent"),
                        rs.getDouble("febRent"),
                        rs.getDouble("marRent"),
                        rs.getDouble("aprRent"),
                        rs.getDouble("mayRent"),
                        rs.getDouble("juneRent"),
                        rs.getDouble("julyRent"),
                        rs.getDouble("augRent"),
                        rs.getDouble("sepRent"),
                        rs.getDouble("octRent"),
                        rs.getDouble("novRent"),
                        rs.getDouble("decRent")

                ));
    }

        public void save(Worker worker){
            MapSqlParameterSource params = new MapSqlParameterSource();
            params.addValue("workerId", worker.getWorkerId());
            params.addValue("rent",worker.getRent());
            params.addValue("janRent",worker.getJanRent());
            params.addValue("febRent",worker.getFebRent());
            params.addValue("marRent",worker.getMarRent());
            params.addValue("aprRent",worker.getAprRent());
            params.addValue("mayRent",worker.getMarRent());
            params.addValue("juneRent",worker.getJuneRent());
            params.addValue("julyRent",worker.getJulyRent());
            params.addValue("augRent",worker.getAugRent());
            params.addValue("sepRent",worker.getSepRent());
            params.addValue("octRent",worker.getOctRent());
            params.addValue("novRent",worker.getNovRent());
            params.addValue("decRent",worker.getDecRent());

            jdbcTemplate.update("insert into WORKERS (workerId,rent,janRent,febRent,marRent,aprRent,juneRent,julyRent,augRent,sepRent,octRent,novRent,decRent) values(:workerId,:rent,:janRent,:febRent,:marRent,:aprRent,:juneRent,:julyRent,:augRent,:sepRent,:octRent,:novRent,:decRent) ",
                    params
            );

        }

}
