package com.kubekthecreator.airbnb_clone_back.booking.mapper;

import com.kubekthecreator.airbnb_clone_back.booking.application.dto.BookedDateDTO;
import com.kubekthecreator.airbnb_clone_back.booking.application.dto.NewBookingDTO;
import com.kubekthecreator.airbnb_clone_back.booking.domain.Booking;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BookingMapper {
    Booking newBookingToBooking(NewBookingDTO newBookingDTO);

    BookedDateDTO bookingToCheckAvailability(Booking booking);
}
