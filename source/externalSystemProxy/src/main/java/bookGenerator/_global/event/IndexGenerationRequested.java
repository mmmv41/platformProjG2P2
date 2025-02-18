package bookGenerator._global.event;

import java.util.Date;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import bookGenerator._global.eventBase.EventNameAnnotation;
import bookGenerator._global.infra.AbstractEvent;

@Data
@ToString
@EqualsAndHashCode(callSuper=false)
@EventNameAnnotation(eventName="IndexGenerationRequested")
public class IndexGenerationRequested extends AbstractEvent {
	private Long id;
	private Long bookId;
	private String name;
	private Long priority;
	private Date createdDate;
	private Date updatedDate;

    public IndexGenerationRequested() {
        super();
    }
}
