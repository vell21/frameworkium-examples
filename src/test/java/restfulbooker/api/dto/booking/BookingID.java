package restfulbooker.api.dto.booking;

import com.frameworkium.core.api.dto.AbstractDTO;

public class BookingID extends AbstractDTO<BookingID> {

    public int bookingid;

    public static BookingID of(int bookingID) {
        var id = new BookingID();
        id.bookingid = bookingID;
        return id;
    }
}
