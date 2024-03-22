package org.example.filmapi.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import java.util.*;

@Entity
@lombok.Getter
@lombok.Setter
public class Photo {
  @Id
  @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
  private Long id;

  private Long filmId;

  private Long CommentId;

  private String imageData;
}