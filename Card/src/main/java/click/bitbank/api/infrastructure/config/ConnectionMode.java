package click.bitbank.api.infrastructure.config;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ConnectionMode {

    MASTER("master", "INSERT, UPDATE, DELETE"),
    SLAVE("slave", "SELECT");

    private final String name;
    private final String description;
}
