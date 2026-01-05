package url.booster.web.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public record CreateUrlDto(

        @NotBlank(message = "Придумайте кастомный URL")
        @Size(max = 113, message = "Общая длина URL не должна превышать 120 символов")
        @Pattern(regexp = "^[A-Za-z0-9_-]+$", message = "Допустимы только латинские буквы, цифры, дефисы и подчёркивания")
        String customUrl,

        @Pattern(regexp = "^[A-Za-z0-9_-]+$", message = "Допустимы только латинские буквы, цифры, дефисы и подчёркивания")
        @NotBlank(message = "Вставьте URL, который хотите преобразовать")
        String originalUrl,

        String owner
) {
}
