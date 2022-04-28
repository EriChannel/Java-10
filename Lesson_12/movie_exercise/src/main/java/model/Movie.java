package model;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import util.Ulti;

import java.util.Arrays;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Movie {
    private int id;
    private String title;
    private String[] category;
    private String director;
    private int length;
    private Date release;
    private long view;

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", category=" + Arrays.toString(category) +
                ", director='" + director + '\'' +
                ", length=" + length +
                ", release=" + Ulti.formatDate(release) +
                ", view=" + view +
                '}';
    }
}
