/*
 * Copyright (c) 2008-2015 JPerf
 * All rights reserved.  http://www.jperf.net
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * Defines the concrete aspect class used to inject timing code around methods that have been marked with the
 * {@link net.jperf.aop.Profiled} annotation. The {@link net.jperf.commonslog.aop.TimingAspect} should be used if you
 * use Apache Commons Logging as a logging facade for your code. Alternatively, if using EJB interceptors, you should
 * use the {@link net.jperf.commonslog.aop.EjbTimingAspect} interceptor.
 * To enable the aspects you must use AspectJ, Spring AOP or EJB interceptors.
 *
 * @see <a href="http://jperf.codehaus.org/devguide.html#Unobtrusive_Logging_with_Profiled_and_AOP">The Perf4J Developer Guide AOP Overview</a>
 * @see <a href="http://www.eclipse.org/aspectj/doc/released/devguide/ajc-ref.html">ajc, the AspectJ compiler/weaver</a>
 * @see <a href="http://www.eclipse.org/aspectj/doc/released/devguide/ltw.html">Load-Time Weaving with AspectJ</a>
 * @see <a href="http://static.springframework.org/spring/docs/2.5.x/reference/aop.html">Spring AOP</a>
 */
package net.jperf.commonslog.aop;