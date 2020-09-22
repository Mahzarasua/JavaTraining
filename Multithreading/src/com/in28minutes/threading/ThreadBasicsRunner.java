package com.in28minutes.threading;
//extends Thread
//implements Runnable
class Task1 extends Thread {
	// Exact signature
	@Override
	public void run() {
		System.out.print("\nTask1 Started ");
		for (int i = 101; i <= 199; i++)
			System.out.print(i + " ");

		System.out.print("\nTask1 Done");
	}
}

class Task2 implements Runnable {

	@Override
	public void run() {
		System.out.print("\nTask2 Started ");
		for (int i = 201; i <= 299; i++)
			System.out.print(i + " ");

		System.out.println("\nTask2 Done");
	}

}

public class ThreadBasicsRunner {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * 
		 * Task1 Kicked Off
		 * 
		 * Task2 Kicked Off
		 * 
		 * Task1 Started 101 102 103 104 105 106 107 108 109 110 111 112 113 114 115 116
		 * 117 118 119 120 121 122 123 124 125 126 127 128 129 Task3 Kicked Off 130 301
		 * Task2 Started 131 201 302 202 132 203 303 204 133 205 304 206 134 207 305 208
		 * 209 135 136 210 211 212 213 214 306 307 215 216 137 217 308 218 138 139 140
		 * 141 219 220 309 310 311 312 313 314 221 222 142 223 315 224 316 143 144 317
		 * 225 318 145 319 320 226 321 146 322 227 323 147 324 228 325 148 326 229 327
		 * 149 328 230 329 150 151 152 153 154 155 156 157 158 159 160 161 162 163 330
		 * 331 231 332 164 333 334 232 335 165 336 233 234 337 338 166 167 339 340 235
		 * 236 341 342 168 169 343 344 237 345 170 171 346 238 347 172 348 239 349 173
		 * 350 240 351 352 353 174 354 241 175 242 355 243 176 244 356 245 177 246 357
		 * 247 178 248 358 249 179 250 359 251 180 252 360 253 181 254 361 255 182 256
		 * 362 257 183 258 363 259 184 260 364 365 366 367 261 262 263 264 265 266 185
		 * 267 368 268 186 269 369 270 187 271 370 272 273 274 275 188 276 371 277 189
		 * 278 372 279 190 280 373 281 191 282 374 283 192 284 375 285 193 286 287 288
		 * 289 290 291 292 293 294 295 376 296 297 298 299 194 Task2 Done 377 195 378
		 * 196 379 380 381 382 383 384 385 386 387 388 389 390 391 392 197 393 394 395
		 * 396 397 398 399 Task3 Done198 Main Done199 Task1 Done
		 */

		// New
		// Runnable
		// Running
		// Blocked/Waiting
		// Terminated/Dead

		// Task 1
		System.out.println("\nTask1 Kicked Off");
		Task1 task1 = new Task1();
		task1.setPriority(1);
		task1.start();

		// Task 2
		System.out.println("\nTask2 Kicked Off");
		Task2 task2 = new Task2();
		Thread task2Thread = new Thread(task2);
		task2Thread.setPriority(10);
		task2Thread.start();

		// wait for task1 complete
		task1.join();
		task2Thread.join();

		// Task 3
		System.out.println("\nTask3 Kicked Off");
		for (int i = 301; i <= 399; i++)
			System.out.print(i + " ");

		System.out.print("\nTask3 Done");

		System.out.print("\nMain Done");

	}

}
