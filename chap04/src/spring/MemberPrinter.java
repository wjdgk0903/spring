package spring;

import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.lang.Nullable;

public class MemberPrinter {
	private DateFormatter deteTimeFormatter;
	
	@Autowired
	public void setDateFormatter(@Nullable DateTimeFormatter dateTimeFormatter) {
		this.dateTimeFormatter = dateTimeFormatter;
	}
	
//	@Autowired
//	public void setDateFormatter(Optional<DateFormatter> formatterOpt) {
//		if(formatterOpt.isPresent()) {
//			this.deteTimeFormatter = formatterOpt.get();
//		}else {
//			this.deteTimeFormatter = null;
//		}
//	}
	
	public void setDateFormatter(DateTimeFormatter dateTimeFormatter) {
		this.deteTimeFormatter = dateTimeFormatter;
	}

	public void print(Member member) {
		if(deteTimeFormatter == null) {
		System.out.printf(
				"회원 정보: 아이디=%d, 이메일=%s, 이름=%s, 등록일=%tF\n", 
				member.getId(), member.getEmail(),
				member.getName(), member.getRegisterDateTime());
	}else {
		System.out.printf(
				"회원 정보: 아이디=%d, 이메일=%s, 이름=%s, 등록일=%tF\n", 
				member.getId(), member.getEmail(),
				member.getName(),
				deteTimeFormatter.format(member.getRegisterDateTime()));
	}

}
}
	
