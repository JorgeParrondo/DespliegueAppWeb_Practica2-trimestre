package LibroDAW.DTO;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class BookDTO {
   

    
    @NotBlank(message = "El autor es obligatorio")
    @Column(nullable = false)
    private String author;
    
    @Column(name = "publication_year")
    private Integer year;
    
    @Size(max = 100)
    private String genre;
    
    @Min(value = 1, message = "Debe tener al menos 1 página")
    private Integer pages;
    
    @Column(columnDefinition = "TEXT")
    private String description;
    
} 
