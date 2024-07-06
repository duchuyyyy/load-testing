package com.pbl.loadpulse.auth.service;

import com.pbl.loadpulse.auth.payload.request.SignInRequest;
import com.pbl.loadpulse.auth.payload.request.SignUpRequest;
import com.pbl.loadpulse.auth.payload.response.JwtResponse;
import com.pbl.loadpulse.auth.payload.response.UserInfoResponse;

public interface UserService {

  UserInfoResponse signUp(SignUpRequest signUpRequest);
  JwtResponse signIn (SignInRequest signInRequest);
}
