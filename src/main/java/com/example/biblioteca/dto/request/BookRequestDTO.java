package dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;

public class BookRequestDTO {

    @NotBlank(message = "O título é obrigatório")
    @Size(max = 256, message = "Máximo 256 caracteres")
    private String titulo;

    @NotBlank(message = "O autor é obrigatório")
    @Size(max = 128, message = "Máximo de 128 caracteres")
    private String author;

    @NotBlank(message = "O isbn é obrigatório")
    @Size(max = 100, message = "Máximo de 100 caracteres")
    private String isbn;

    @Size(max = 128, message = "Máximo de 128 caracteres")
    private String publisher;

    private Integer publicationYear;

    @NotBlank(message = "O totalCopies é obrigatório")
    @PositiveOrZero(message = "O totalCopies não pode ser negativo")
    private Integer totalCopies;

    @Size(max = 128, message = "Máximo de 128 caracteres")
    private String category;

}
