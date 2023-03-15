package org.nimofy;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Table(name = "notes")
@Entity
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "body")
    private String body;

    @Column(name = "created_at", insertable = false)
    private LocalDateTime createdAt;

    @Column(name = "person_id")
    private Integer personId;

    @Column(name = "version")
    private Integer version;

    public void setBody(String body) {
        this.body = body;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    @Override
    public String toString() {
        return "Note{" +
                "id=" + id +
                ", body='" + body + '\'' +
                ", createdAt=" + createdAt +
                ", personId=" + personId +
                ", version=" + version +
                '}';
    }
}
