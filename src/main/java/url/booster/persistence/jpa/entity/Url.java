package url.booster.persistence.jpa.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "url")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Url {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "custom_url", unique = true, nullable = false)
    private String customUrl;

    @Column(name = "original_url", nullable = false)
    private String originalUrl;

    @Column(name = "theme")
    private String theme;

    @Column(name = "owner", nullable = false)
    private String owner = "Wersatil";
}
