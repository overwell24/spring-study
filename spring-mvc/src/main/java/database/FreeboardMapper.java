package database;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import beans.Freeboard;

@Mapper // MyBatis 매퍼 인터페이스임을 나타냅니다.
public interface FreeboardMapper {
    
    // freeboard 테이블의 모든 레코드를 선택합니다.
    @Select("SELECT * FROM freeboard")
    List<Freeboard> selectAll();

    // freeboard 테이블에서 특정 ID에 해당하는 레코드를 선택합니다.
    @Select("SELECT * FROM freeboard WHERE id = #{id}")
    Freeboard select(String id);

    // freeboard 테이블에 새로운 레코드를 삽입합니다.
    @Insert("INSERT INTO freeboard (title, content, writer) VALUES (#{title}, #{content}, #{writer})")
    void insert(Freeboard freeboard);

    // freeboard 테이블에서 특정 ID에 해당하는 레코드를 업데이트합니다.
    @Update("UPDATE freeboard SET title = #{title}, content = #{content}, writer = #{writer} WHERE id = #{id}")
    void update(Freeboard freeboard);
}
