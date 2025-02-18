package bookGenerator.endPoint;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;

import javax.transaction.Transactional;

import lombok.Data;
import lombok.Getter;
import lombok.ToString;

import bookGenerator._global.logger.CustomLogger;
import bookGenerator._global.logger.CustomLoggerType;
import bookGenerator.domain.BookShelfBook;


@Data
@ToString
class DeleteBookShelfReqDto {
    private Long bookShelfBookId;
}

@Getter
@ToString
class DeleteBookShelfResDto {
    private final Long id;

    public DeleteBookShelfResDto(BookShelfBook bookShelfBook) {
        this.id = bookShelfBook.getId();
    }
}


@RestController
@Transactional
@RequestMapping("/bookShelfBooks")
public class DeleteBookShelfBookEndPoints {

    @PutMapping("/deleteBookShelfBook")
    public ResponseEntity<Void> deleteBookShelfBook(@RequestBody DeleteBookShelfReqDto reqDto) {
        try {

            CustomLogger.debugObject(CustomLoggerType.ENTER, reqDto);

            // [1] reqDto.bookShelfBookId로 BookShelfBook 객체를 찾음

            // [2] BookShelfBook 객체를 삭제

            // [3] BookShelfBookDeleted 이벤트를 찾은 BookShelfBook 객체로 발생시킴
            
            // [4] 찾은 BookShelfBook 객체의 ID를 반환

            CustomLogger.debug(CustomLoggerType.EXIT);

            return ResponseEntity.status(HttpStatus.OK).build();

        } catch(Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }

}
