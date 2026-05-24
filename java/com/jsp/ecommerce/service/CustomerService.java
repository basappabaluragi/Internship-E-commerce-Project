package com.jsp.ecommerce.service;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import com.jsp.ecommerce.dto.UserDto;

import jakarta.servlet.http.HttpSession;

public interface CustomerService {

	String register(UserDto userDto, Model model);

	String register(UserDto userDto, BindingResult result, HttpSession session);

	String sumbitOtp(int otp, HttpSession session);

	String loadHome(HttpSession session);

	String viewProducts(HttpSession session, Model model, String category, String sort, String search);

	String addToCart(long id, HttpSession session);

	String viewCart(HttpSession session, Model model);

	String increaseQuantity(long id, HttpSession session);

	String decreaseQuantity(long id, HttpSession session);

	String proceedPayment(HttpSession session, Model model);

	String confirmPament(long id, String paymentId, HttpSession session);

	String manageProfile(HttpSession session,Model model);

	String manageProfile(HttpSession session, UserDto dto, Long mobile, String address);

    String orderHistory(HttpSession session, Model model);

    String loadTrackOrder(HttpSession session);

    String trackOrders(long orderId, HttpSession session, Model model);

}
