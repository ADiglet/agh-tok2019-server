package pl.edu.agh.toik.infun.model.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaskConfig {

    public String name;
    public List<ParameterConfig> config;

}
