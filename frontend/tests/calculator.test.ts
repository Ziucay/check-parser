import '@testing-library/jest-dom';

import { render } from '@testing-library/svelte';

import ReceiptCalculator from '../src/lib/ReceiptCalculator.svelte';

test('Shows proper sum', () => {
	const receiptFile = [
		{
			_id: '63a21cf93d0e75074b89798f',
			createdAt: '2022-12-20T20:37:13+00:00',
			ticket: {
				document: {
					receipt: {
						cashTotalSum: 0,
						code: 3,
						creditSum: 0,
						dateTime: '2022-11-26T17:35:00',
						ecashTotalSum: 40888,
						fiscalDocumentFormatVer: 4,
						fiscalDocumentNumber: 21546,
						fiscalDriveNumber: '9960440503084109',
						fiscalSign: 81276461,
						fnsUrl: 'www.nalog.gov.ru',
						items: [
							{
								name: 'MIXB.Попкорн д/СВЧ сл-сол.вк85г',
								nds: 2,
								paymentType: 4,
								price: 4999,
								productType: 1,
								productCodeDataError: 'not supported product type 3',
								quantity: 2,
								sum: 9998
							},
							{
								name: 'Салат листовой в горшочке 1шт',
								nds: 2,
								paymentType: 4,
								price: 5719,
								productType: 1,
								productCodeDataError: 'not supported product type 3',
								quantity: 1,
								sum: 5719
							},
							{
								name: '*GL.VIL.Кукуруза сахар.ж/б 425мл',
								nds: 1,
								paymentType: 4,
								price: 5999,
								productType: 1,
								productCodeDataError: 'not supported product type 3',
								quantity: 1,
								sum: 5999
							},
							{
								name: 'ТЕНД.Грудка кур.охл.подл.1кг',
								nds: 2,
								paymentType: 4,
								price: 20999,
								productType: 1,
								productCodeDataError: 'not supported product type 3',
								quantity: 0.913,
								sum: 19172
							}
						],
						kktRegId: '0006643269031708    ',
						machineNumber: '0410960012168119',
						nds10: 3172,
						nds18: 1000,
						operationType: 1,
						prepaidSum: 0,
						properties: { propertyName: 'Код', propertyValue: 'Y833' },
						provisionSum: 0,
						requestNumber: 160,
						retailPlace: 'Y833, 12774 Пятерочка',
						retailPlaceAddress:
							'420500, 16 - Республика Татарстан (Татарстан), м.р-н Верхнеуслонский, г/п город Иннополис, г Иннополис, ул Спортивная, Дом 126',
						shiftNumber: 106,
						taxationType: 1,
						appliedTaxationType: 1,
						totalSum: 40888,
						user: 'ООО Агроторг',
						userInn: '7825706086  '
					}
				}
			}
		},
		{
			_id: '63a218633d0e75074b8975e0',
			createdAt: '2022-12-20T20:17:39+00:00',
			ticket: {
				document: {
					receipt: {
						buyerPhoneOrAddress: 'justlumajustmail@gmail.com',
						cashTotalSum: 0,
						code: 3,
						creditSum: 0,
						dateTime: '2022-11-30T21:18:00',
						ecashTotalSum: 140800,
						fiscalDocumentFormatVer: 2,
						fiscalDocumentNumber: 145251,
						fiscalDriveNumber: '9960440301547597',
						fiscalSign: 2252975677,
						internetSign: 1,
						items: [
							{
								name: 'Кофе Бэрри',
								nds: 1,
								ndsSum: 2753,
								paymentType: 1,
								price: 16517,
								productType: 1,
								quantity: 1,
								sum: 16517,
								unit: 'шт'
							},
							{
								name: 'Кофе Бэрри',
								nds: 1,
								ndsSum: 5796,
								paymentType: 1,
								price: 34777,
								productType: 1,
								quantity: 1,
								sum: 34777,
								unit: 'шт'
							},
							{
								name: 'Кофе Christmas Blend 2023',
								nds: 1,
								ndsSum: 6903,
								paymentType: 1,
								price: 41417,
								productType: 1,
								quantity: 1,
								sum: 41417,
								unit: 'шт'
							},
							{
								name: 'Кофе Мексика Чьяпас',
								nds: 1,
								ndsSum: 7180,
								paymentType: 1,
								price: 43077,
								productType: 1,
								quantity: 1,
								sum: 43077,
								unit: 'шт'
							},
							{
								name: 'Доставка',
								nds: 1,
								ndsSum: 833,
								paymentType: 1,
								price: 5000,
								productType: 4,
								quantity: 1,
								sum: 5000,
								unit: 'шт'
							},
							{
								name: 'Доплата по заказу',
								nds: 1,
								ndsSum: 2,
								paymentType: 1,
								price: 12,
								productType: 4,
								quantity: 1,
								sum: 12,
								unit: 'шт'
							}
						],
						kktRegId: '0001394061044827    ',
						machineNumber: 'KSR13.4-8-43',
						nds18: 23467,
						operationType: 1,
						prepaidSum: 0,
						provisionSum: 0,
						requestNumber: 680,
						retailPlace: 'https://shop.tastycoffee.ru',
						sellerAddress: 'shop@tastycoffee.ru',
						shiftNumber: 318,
						taxationType: 1,
						appliedTaxationType: 1,
						totalSum: 140800,
						user: 'ОБЩЕСТВО С ОГРАНИЧЕННОЙ ОТВЕТСТВЕННОСТЬЮ "КОФЕ С ДОСТАВКОЙ"',
						userInn: '1832131543  '
					}
				}
			}
		},
		{
			_id: '63a21b903d0e75074b89787b',
			createdAt: '2022-12-20T20:31:12+00:00',
			ticket: {
				document: {
					receipt: {
						cashTotalSum: 0,
						code: 3,
						creditSum: 0,
						dateTime: '2022-12-12T13:38:00',
						ecashTotalSum: 16796,
						fiscalDocumentFormatVer: 4,
						fiscalDocumentNumber: 27088,
						fiscalDriveNumber: '9960440301642989',
						fiscalSign: 1808871733,
						fnsUrl: 'www.nalog.gov.ru',
						items: [
							{
								name: 'Стакан Ода низкий 250мл (ОСЗ):15',
								nds: 1,
								paymentType: 4,
								price: 2899,
								productType: 1,
								productCodeDataError: 'not supported product type 3',
								quantity: 2,
								sum: 5798
							},
							{
								name: 'Пакеты для мусора 20шт/35л/11мкн (Импэкс):30',
								nds: 1,
								paymentType: 4,
								price: 5499,
								productType: 1,
								productCodeDataError: 'not supported product type 3',
								quantity: 2,
								sum: 10998
							}
						],
						kktRegId: '0003218182040203    ',
						nds18: 2799,
						operationType: 1,
						operator: 'Старший продавец Гуджатуллаева',
						prepaidSum: 0,
						provisionSum: 0,
						requestNumber: 27,
						retailPlace: 'Магазин  Магнит  Бытование',
						retailPlaceAddress:
							'420500, Татарстан Респ, Верхнеуслонский р-н, Иннополис г, Спортивная ул, дом № 120',
						shiftNumber: 277,
						taxationType: 1,
						appliedTaxationType: 1,
						totalSum: 16796,
						user: 'АКЦИОНЕРНОЕ ОБЩЕСТВО "ТАНДЕР"',
						userInn: '2310031475  '
					}
				}
			}
		},
		{
			_id: '63a814eac59d30da4b7e92ee',
			createdAt: '2022-12-25T09:16:26+00:00',
			ticket: {
				document: {
					receipt: {
						buyerPhoneOrAddress: '+79196499084',
						cashTotalSum: 0,
						code: 3,
						creditSum: 0,
						dateTime: '2022-12-24T10:05:00',
						ecashTotalSum: 26000,
						fiscalDocumentFormatVer: 2,
						fiscalDocumentNumber: 197380,
						fiscalDriveNumber: '9960440502895404',
						fiscalSign: 2602442023,
						fnsUrl: 'nalog.gov.ru',
						internetSign: 1,
						items: [
							{
								name: 'Аванс',
								nds: 3,
								ndsSum: 4333,
								paymentType: 4,
								price: 26000,
								productType: 10,
								quantity: 1,
								sum: 26000
							}
						],
						kktRegId: '0002545418041061    ',
						nds18118: 4333,
						operationType: 1,
						operator: 'СИС. АДМИНИСТРАТОР',
						prepaidSum: 0,
						provisionSum: 0,
						requestNumber: 2481,
						retailPlace: 'yota.ru',
						retailPlaceAddress: 'г. Москва, ул. Ленинская Слобода, д.19',
						sellerAddress: 'noreply@ofd.ru',
						shiftNumber: 39,
						taxationType: 1,
						appliedTaxationType: 1,
						totalSum: 26000,
						user: 'Общество с ограниченной ответственностью "Скартел"',
						userInn: '7701725181  '
					}
				}
			}
		},
		{
			_id: '63a814eac59d30da4b7e92ed',
			createdAt: '2022-12-25T09:16:26+00:00',
			ticket: {
				document: {
					receipt: {
						buyerPhoneOrAddress: '+79196499084',
						cashTotalSum: 0,
						code: 3,
						creditSum: 0,
						dateTime: '2022-12-24T15:33:00',
						ecashTotalSum: 19100,
						fiscalDocumentFormatVer: 4,
						fiscalDocumentNumber: 25822,
						fiscalDriveNumber: '9960440503330269',
						fiscalSign: 2481356550,
						fnsUrl: 'www.nalog.gov.ru',
						internetSign: 1,
						items: [
							{
								name: 'Перевозка пассажиров и багажа',
								nds: 6,
								paymentAgentByProductType: 64,
								paymentType: 4,
								price: 19100,
								productType: 1,
								providerInn: '165036356219',
								quantity: 1,
								sum: 19100
							}
						],
						kktRegId: '0002515146032269    ',
						machineNumber: 'whitespirit2f',
						ndsNo: 19100,
						operationType: 1,
						prepaidSum: 0,
						properties: {
							propertyName: 'psp_payment_id',
							propertyValue: 'payment_a84f4eb0fd6f440d857e0f2744f27b59|authorization_d219b792'
						},
						propertiesData: 'ws:C6CQ6KQWS7',
						provisionSum: 0,
						requestNumber: 914,
						retailPlace: 'taxi.yandex.ru',
						retailPlaceAddress: '141004, Россия, Московская обл., г. Мытищи, ул. Силикатная, д. 19',
						sellerAddress: 'support@go.yandex.com',
						shiftNumber: 30,
						taxationType: 1,
						appliedTaxationType: 1,
						totalSum: 19100,
						user: 'ОБЩЕСТВО С ОГРАНИЧЕННОЙ ОТВЕТСТВЕННОСТЬЮ "ЯНДЕКС.ТАКСИ"',
						userInn: '7704340310  '
					}
				}
			}
		}
	];

	render(ReceiptCalculator, { receipt: receiptFile });
	const sum = document.getElementById('sum');
	if (sum != null) {
		expect(sum).toBeInTheDocument();
		expect(sum.textContent).toBe('Sum: 1217.92');
	}
});
