<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!--jsp:include page="/web-page/include/header.jsp"/-->
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>${requestScope['javax.servlet.error.status_code']} Error</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="shortcut icon" href="/images/favicon/D3.png"/>
<link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
<link rel="stylesheet" href="/js/bootstrap-2.3.2/docs/assets/css/bootstrap.min.css">
<link rel='stylesheet' href="/js/css/MainStyle.css" type='text/css'>
</head>
<div style="padding:10px; width:98%; z-index: 666662">
	<div>
		<div style="text-align:center; margin-top:50px;">
			<img src="/images/error/error_java.png" style="width:150px;" alt="license:YS JI"/>
		</div>
		<div style="text-align:center; margin-top:10px; font-weight: bold; font-size: 15px; color:#D90B10;">
			<div>
				<span style="color:#000; font-size: 25px; padding-bottom:10px;">${requestScope['javax.servlet.error.status_code']} Error</span>
			</div>

			<c:if test="${ requestScope['javax.servlet.error.status_code'] eq '400' }"> (잘못된 요청): 서버가 요청의 구문을 인식하지 못했다.                                                                                                                                                                                                                           </c:if>
			<c:if test="${ requestScope['javax.servlet.error.status_code'] eq '401' }"> (권한 없음): 이 요청은 인증이 필요하다. 서버는 로그인이 필요한 페이지에 대해 이 요청을 제공할 수 있다. 상태 코드 이름이 권한 없음(Unauthorized)으로 되어 있지만 실제 뜻은 인증 안됨(Unauthenticated)에 더 가깝다.[2]                                                           </c:if>
			<c:if test="${ requestScope['javax.servlet.error.status_code'] eq '402' }"> (결제 필요): 이 요청은 결제가 필요합니다.                                                                                                                                                                                                                                      </c:if>
			<c:if test="${ requestScope['javax.servlet.error.status_code'] eq '403' }"> (Forbidden, 금지됨): 서버가 요청을 거부하고 있다. 예를 들자면, 사용자가 리소스에 대한 필요 권한을 갖고 있지 않다. (401은 인증 실패, 403은 인가 실패라고 볼 수 있음)                                                                                                            </c:if>
			<c:if test="${ requestScope['javax.servlet.error.status_code'] eq '404' }"> (Not Found, 찾을 수 없음): 서버가 요청한 페이지(Resource)를 찾을 수 없다. 예를 들어 서버에 존재하지 않는 페이지에 대한 요청이 있을 경우 서버는 이 코드를 제공한다.                                                                                                             </c:if>
			<c:if test="${ requestScope['javax.servlet.error.status_code'] eq '405' }"> (허용되지 않는 방법): 요청에 지정된 방법을 사용할 수 없다.                                                                                                                                                                                                                     </c:if>
			<c:if test="${ requestScope['javax.servlet.error.status_code'] eq '406' }"> (허용되지 않음): 요청한 페이지가 요청한 콘텐츠 특성으로 응답할 수 없다.                                                                                                                                                                                                        </c:if>
			<c:if test="${ requestScope['javax.servlet.error.status_code'] eq '407' }"> (프록시 인증 필요): 이 상태 코드는 401(권한 없음)과 비슷하지만 요청자가 프록시를 사용하여 인증해야 한다. 서버가 이 응답을 표시하면 요청자가 사용할 프록시를 가리키는 것이기도 한다.                                                                                            </c:if>
			<c:if test="${ requestScope['javax.servlet.error.status_code'] eq '408' }"> (요청 시간초과): 서버의 요청 대기가 시간을 초과하였다.                                                                                                                                                                                                                         </c:if>
			<c:if test="${ requestScope['javax.servlet.error.status_code'] eq '409' }"> (충돌): 서버가 요청을 수행하는 중에 충돌이 발생했다. 서버는 응답할 때 충돌에 대한 정보를 포함해야 한다. 서버는 PUT 요청과 충돌하는 PUT 요청에 대한 응답으로 이 코드를 요청 간 차이점 목록과 함께 표시해야 한다.                                                                </c:if>
			<c:if test="${ requestScope['javax.servlet.error.status_code'] eq '410' }"> (사라짐): 서버는 요청한 리소스가 영구적으로 삭제되었을 때 이 응답을 표시한다. 404(찾을 수 없음) 코드와 비슷하며 이전에 있었지만 더 이상 존재하지 않는 리소스에 대해 404 대신 사용하기도 한다. 리소스가 영구적으로 이동된 경우 301을 사용하여 리소스의 새 위치를 지정해야 한다. </c:if>
			<c:if test="${ requestScope['javax.servlet.error.status_code'] eq '411' }"> (길이 필요): 서버는 유효한 콘텐츠 길이 헤더 입력란 없이는 요청을 수락하지 않는다.                                                                                                                                                                                              </c:if>
			<c:if test="${ requestScope['javax.servlet.error.status_code'] eq '412' }"> (사전조건 실패): 서버가 요청자가 요청 시 부과한 사전조건을 만족하지 않는다.                                                                                                                                                                                                    </c:if>
			<c:if test="${ requestScope['javax.servlet.error.status_code'] eq '413' }"> (요청 속성이 너무 큼): 요청이 너무 커서 서버가 처리할 수 없다.                                                                                                                                                                                                                 </c:if>
			<c:if test="${ requestScope['javax.servlet.error.status_code'] eq '414' }"> (요청 URI가 너무 긺): 요청 URI(일반적으로 URL)가 너무 길어 서버가 처리할 수 없다.                                                                                                                                                                                              </c:if>
			<c:if test="${ requestScope['javax.servlet.error.status_code'] eq '415' }"> (지원되지 않는 미디어 유형): 요청이 요청한 페이지에서 지원하지 않는 형식으로 되어 있다.                                                                                                                                                                                        </c:if>
			<c:if test="${ requestScope['javax.servlet.error.status_code'] eq '416' }"> (처리할 수 없는 요청범위): 요청이 페이지에서 처리할 수 없는 범위에 해당되는 경우 서버는 이 상태 코드를 표시한다.                                                                                                                                                               </c:if>
			<c:if test="${ requestScope['javax.servlet.error.status_code'] eq '417' }"> (예상 실패): 서버는 Expect 요청 헤더 입력란의 요구사항을 만족할 수 없다.                                                                                                                                                                                                       </c:if>
			<c:if test="${ requestScope['javax.servlet.error.status_code'] eq '418' }"> (I'm a teapot, RFC 2324)                                                                                                                                                                                                                                                       </c:if>
			<c:if test="${ requestScope['javax.servlet.error.status_code'] eq '420' }"> (Enhance Your Calm, 트위터)                                                                                                                                                                                                                                                    </c:if>
			<c:if test="${ requestScope['javax.servlet.error.status_code'] eq '422' }"> (처리할 수 없는 엔티티, WebDAV; RFC 4918)                                                                                                                                                                                                                                      </c:if>
			<c:if test="${ requestScope['javax.servlet.error.status_code'] eq '423' }"> (잠김,WebDAV; RFC 4918)                                                                                                                                                                                                                                                        </c:if>
			<c:if test="${ requestScope['javax.servlet.error.status_code'] eq '424' }"> (실패된 의존성, WebDAV; RFC 4918)                                                                                                                                                                                                                                              </c:if>
			<c:if test="${ requestScope['javax.servlet.error.status_code'] eq '424' }"> (메쏘드 실패, WebDAV)                                                                                                                                                                                                                                                          </c:if>
			<c:if test="${ requestScope['javax.servlet.error.status_code'] eq '425' }"> (정렬되지 않은 컬렉션, 인터넷 초안)                                                                                                                                                                                                                                            </c:if>
			<c:if test="${ requestScope['javax.servlet.error.status_code'] eq '426' }"> (업그레이드 필요, RFC 2817)                                                                                                                                                                                                                                                    </c:if>
			<c:if test="${ requestScope['javax.servlet.error.status_code'] eq '428' }"> (전제조건 필요, RFC 6585)                                                                                                                                                                                                                                                      </c:if>
			<c:if test="${ requestScope['javax.servlet.error.status_code'] eq '429' }"> (너무 많은 요청, RFC 6585)                                                                                                                                                                                                                                                     </c:if>
			<c:if test="${ requestScope['javax.servlet.error.status_code'] eq '431' }"> (요청 헤더 필드가 너무 큼, RFC 6585)                                                                                                                                                                                                                                           </c:if>
			<c:if test="${ requestScope['javax.servlet.error.status_code'] eq '444' }"> (응답 없음, Nginx)                                                                                                                                                                                                                                                             </c:if>
			<c:if test="${ requestScope['javax.servlet.error.status_code'] eq '449' }"> (다시 시도, 마이크로소프트)                                                                                                                                                                                                                                                    </c:if>
			<c:if test="${ requestScope['javax.servlet.error.status_code'] eq '450' }"> (윈도 자녀 보호에 의해 차단됨, 마이크로소프트)                                                                                                                                                                                                                                 </c:if>
			<c:if test="${ requestScope['javax.servlet.error.status_code'] eq '451' }"> (법적인 이유로 이용 불가, 인터넷 초안)                                                                                                                                                                                                                                         </c:if>
			<c:if test="${ requestScope['javax.servlet.error.status_code'] eq '451' }"> (리다이렉션, 마이크로소프트)                                                                                                                                                                                                                                                   </c:if>
			<c:if test="${ requestScope['javax.servlet.error.status_code'] eq '494' }"> (요청 헤더가 너무 큼, Nginx)                                                                                                                                                                                                                                                   </c:if>
			<c:if test="${ requestScope['javax.servlet.error.status_code'] eq '495' }"> (Cert 오류, Nginx)                                                                                                                                                                                                                                                             </c:if>
			<c:if test="${ requestScope['javax.servlet.error.status_code'] eq '496' }"> (Cert 없음, Nginx)                                                                                                                                                                                                                                                             </c:if>
			<c:if test="${ requestScope['javax.servlet.error.status_code'] eq '497' }"> (HTTP to HTTPS, Nginx)                                                                                                                                                                                                                                                         </c:if>
			<c:if test="${ requestScope['javax.servlet.error.status_code'] eq '499' }"> (클라이언트가 요청을 닫음, Nginx)                                                                                                                                                                                                                                              </c:if>

			<c:if test="${ requestScope['javax.servlet.error.status_code'] eq '500' }"> (내부 서버 오류): 서버에 오류가 발생하여 요청을 수행할 수 없다.                                                                               </c:if>
			<c:if test="${ requestScope['javax.servlet.error.status_code'] eq '501' }"> (구현되지 않음): 서버에 요청을 수행할 수 있는 기능이 없다. 예를 들어 서버가 요청 메소드를 인식하지 못할 때 이 코드를 표시한다.                </c:if>
			<c:if test="${ requestScope['javax.servlet.error.status_code'] eq '502' }"> (Bad Gateway, 불량 게이트웨이): 서버가 게이트웨이나 프록시 역할을 하고 있거나 또는 업스트림 서버에서 잘못된 응답을 받았다.                    </c:if>
			<c:if test="${ requestScope['javax.servlet.error.status_code'] eq '503' }"> (서비스를 사용할 수 없음): 서버가 오버로드되었거나 유지관리를 위해 다운되었기 때문에 현재 서버를 사용할 수 없다. 이는 대개 일시적인 상태이다. </c:if>
			<c:if test="${ requestScope['javax.servlet.error.status_code'] eq '504' }"> (게이트웨이 시간초과): 서버가 게이트웨이나 프록시 역할을 하고 있거나 또는 업스트림 서버에서 제때 요청을 받지 못했다.                          </c:if>
			<c:if test="${ requestScope['javax.servlet.error.status_code'] eq '505' }"> (HTTP 버전이 지원되지 않음): 서버가 요청에 사용된 HTTP 프로토콜 버전을 지원하지 않는다.                                                       </c:if>
			<c:if test="${ requestScope['javax.servlet.error.status_code'] eq '506' }"> (Variant Also Negotiates, RFC 2295)                                                                                                           </c:if>
			<c:if test="${ requestScope['javax.servlet.error.status_code'] eq '507' }"> (용량 부족, WebDAV; RFC 4918)                                                                                                                 </c:if>
			<c:if test="${ requestScope['javax.servlet.error.status_code'] eq '508' }"> (루프 감지됨, WebDAV; RFC 5842)                                                                                                               </c:if>
			<c:if test="${ requestScope['javax.servlet.error.status_code'] eq '509' }"> (대역폭 제한 초과, Apache bw/limited extension)                                                                                               </c:if>
			<c:if test="${ requestScope['javax.servlet.error.status_code'] eq '510' }"> (확장되지 않음, RFC 2774)                                                                                                                     </c:if>
			<c:if test="${ requestScope['javax.servlet.error.status_code'] eq '511' }"> (네트워크 인증 필요, RFC 6585)                                                                                                                </c:if>
			<c:if test="${ requestScope['javax.servlet.error.status_code'] eq '598' }"> (네트워크 읽기 시간초과 오류, 알 수 없음)                                                                                                     </c:if>
			<c:if test="${ requestScope['javax.servlet.error.status_code'] eq '599' }"> (네트워크 연결 시간초과 오류, 알 수 없음)                                                                                                     </c:if>

		</div>
		<div style="text-align:center; margin-top:20px;">
			<a href="javascript:history.back();">이전페이지</a>
		</div>
	</div>
	<div style="folst:clear; padding-top:20px;"></div>
	<table border='0' cellpadding=0 cellspacing=0 width='100%' align='center' class=' table_in_border error_page'>
		<tr><td class='tl mm btn-default wi_150'> Status_code    </td><td class="tl"> <c:out value="${requestScope['javax.servlet.error.status_code']}"   /> </td></tr>
		<tr><td class='tl mm btn-default wi_150'> Request_uri    </td><td class="tl"> <c:out value="${requestScope['javax.servlet.error.request_uri']}"   /> </td></tr>
		<tr><td class='tl mm btn-default wi_150'> Exception_type </td><td class="tl"> <c:out value="${requestScope['javax.servlet.error.exception_type']}"/> </td></tr>
		<tr><td class='tl mm btn-default wi_150'> Servlet_name   </td><td class="tl"> <c:out value="${requestScope['javax.servlet.error.servlet_name']}"  /> </td></tr>
		<tr><td class='tl mm btn-default wi_150'> Message        </td><td class="tl"> <c:out value="${requestScope['javax.servlet.error.message']}"       /> </td></tr>    
		<tr><td class='tl mm btn-default wi_150'> Exception      </td><td class="tl"> <c:out value="${requestScope['javax.servlet.error.exception']}"     /> </td></tr>  
	</table>
</div>

</body>
</html>
