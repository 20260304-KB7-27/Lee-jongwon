import api from '@/api';

const BASE_URL = '/api/board';

export default {
  async getList() {
    const { data } = await api.get(`${BASE_URL}/list`);
    return data;
  },

};
